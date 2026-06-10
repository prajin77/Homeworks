/* ===== PRAJIN V — MAIN SCRIPTS ===== */

// --- SCROLL REVEAL ---
const observer = new IntersectionObserver(
  entries => {
    entries.forEach(e => {
      if (e.isIntersecting) e.target.classList.add('visible');
    });
  },
  { threshold: 0.12 }
);
document.querySelectorAll('.reveal').forEach(el => observer.observe(el));


// --- ACTIVE NAV HIGHLIGHT ---
const navLinks = document.querySelectorAll('.nav-links a');
const sections = document.querySelectorAll('section[id]');

window.addEventListener('scroll', () => {
  let current = '';
  sections.forEach(s => {
    if (window.scrollY >= s.offsetTop - 120) current = s.id;
  });
  navLinks.forEach(a => {
    a.style.color = a.getAttribute('href') === '#' + current ? 'var(--cyan)' : '';
  });
}, { passive: true });


// --- HERO TYPING ANIMATION ---
const roles = ['Full Stack Developer', 'Java Engineer', 'AI/ML Enthusiast', 'Problem Solver'];
const lines = ['building scalable_apps', 'solving problems.java', 'learning AI_models', 'writing clean_code'];
let ri = 0, ci = 0, deleting = false;
let li = 0, lci = 0, ldeleting = false;

function typeRole() {
  const el = document.getElementById('typed-role');
  if (!el) return;
  const target = roles[ri];
  if (!deleting) {
    el.textContent = target.slice(0, ++ci);
    if (ci === target.length) { deleting = true; setTimeout(typeRole, 1800); return; }
  } else {
    el.textContent = target.slice(0, --ci);
    if (ci === 0) { deleting = false; ri = (ri + 1) % roles.length; }
  }
  setTimeout(typeRole, deleting ? 60 : 100);
}

function typeLine() {
  const el = document.getElementById('typed-text');
  if (!el) return;
  const target = lines[li];
  if (!ldeleting) {
    el.textContent = target.slice(0, ++lci);
    if (lci === target.length) { ldeleting = true; setTimeout(typeLine, 1400); return; }
  } else {
    el.textContent = target.slice(0, --lci);
    if (lci === 0) { ldeleting = false; li = (li + 1) % lines.length; }
  }
  setTimeout(typeLine, ldeleting ? 50 : 90);
}

typeRole();
typeLine();


// --- CARD 3D TILT ---
document.querySelectorAll('.project-card').forEach(card => {
  card.addEventListener('mousemove', e => {
    const rect = card.getBoundingClientRect();
    const x = e.clientX - rect.left;
    const y = e.clientY - rect.top;
    const rotateX = ((rect.height / 2 - y) / (rect.height / 2)) * 5;
    const rotateY = ((x - rect.width / 2) / (rect.width / 2)) * 5;
    card.style.transform = `perspective(1000px) rotateX(${rotateX}deg) rotateY(${rotateY}deg) translateY(-2px)`;
  });
  card.addEventListener('mouseleave', () => {
    card.style.transform = '';
  });
});


// --- MAGNETIC BUTTONS ---
document.querySelectorAll('.btn-primary, .btn-secondary').forEach(btn => {
  btn.addEventListener('mousemove', e => {
    const rect = btn.getBoundingClientRect();
    const x = e.clientX - rect.left - rect.width / 2;
    const y = e.clientY - rect.top - rect.height / 2;
    btn.style.transform = `translate(${x * 0.3}px, ${y * 0.3}px)`;
  });
  btn.addEventListener('mouseleave', () => {
    btn.style.transform = '';
  });
});
