// --- CANVAS STARS PARTICLE ENVIRONMENT ---
const canvas = document.getElementById('canvas-stars');
if (canvas) {
  const ctx = canvas.getContext('2d');
  let stars = [];
  let mouse = { x: 0, y: 0, active: false };

  function resizeCanvas() {
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;
  }
  resizeCanvas();
  window.addEventListener('resize', resizeCanvas);

  class Star {
    constructor() {
      this.reset();
    }
    reset() {
      this.x = Math.random() * canvas.width;
      this.y = Math.random() * canvas.height;
      this.size = Math.random() * 1.5 + 0.5;
      this.speed = Math.random() * 0.15 + 0.05;
      this.opacity = Math.random() * 0.7 + 0.2;
      this.color = Math.random() > 0.5 ? '#00E5FF' : '#8B5CF6';
    }
    update() {
      this.y -= this.speed;
      if (this.y < 0) {
        this.reset();
        this.y = canvas.height;
      }
      // Mouse reactive glow spot
      if (mouse.active) {
        const dx = this.x - mouse.x;
        const dy = this.y - mouse.y;
        const dist = Math.sqrt(dx * dx + dy * dy);
        if (dist < 120) {
          this.opacity = Math.min(1, this.opacity + 0.05);
          this.size = Math.min(3, this.size + 0.1);
        }
      }
    }
    draw() {
      ctx.beginPath();
      ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
      ctx.fillStyle = this.color;
      ctx.globalAlpha = this.opacity;
      ctx.fill();
    }
  }

  // Populate stars
  for (let i = 0; i < 80; i++) {
    stars.push(new Star());
  }

  // Mouse move listener
  window.addEventListener('mousemove', (e) => {
    mouse.x = e.clientX;
    mouse.y = e.clientY;
    mouse.active = true;
  });

  window.addEventListener('mouseleave', () => {
    mouse.active = false;
  });

  function animateStars() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    stars.forEach(star => {
      star.update();
      star.draw();
    });
    
    // Draw mouse radial glow
    if (mouse.active) {
      ctx.beginPath();
      const radialGlow = ctx.createRadialGradient(mouse.x, mouse.y, 0, mouse.x, mouse.y, 150);
      radialGlow.addColorStop(0, 'rgba(0, 229, 255, 0.04)');
      radialGlow.addColorStop(0.5, 'rgba(139, 92, 246, 0.01)');
      radialGlow.addColorStop(1, 'transparent');
      ctx.fillStyle = radialGlow;
      ctx.globalAlpha = 1;
      ctx.arc(mouse.x, mouse.y, 150, 0, Math.PI * 2);
      ctx.fill();
    }

    requestAnimationFrame(animateStars);
  }
  animateStars();
}
