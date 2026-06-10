// --- HERO LIVE TERMINAL AUTO-BOOT ---
const heroTerminal = document.getElementById('hero-terminal-body');
const bootLines = [
  { text: "> initializing digital_engineer_core...", color: "cyan" },
  { text: "> loading system environments...", color: "muted" },
  { text: "> establishing transactional databases...", color: "muted" },
  { text: "> verifying local MySQL JDBC driver...", color: "cyan" },
  { text: "  [JDBC DRIVER COM.MYSQL.CJ.JDBC.DRIVER] -> verified.", color: "purple" },
  { text: "> loading springboot rest api configurations...", color: "cyan" },
  { text: "  [API CONTROLLER INVOCATION LAYER] -> functional.", color: "purple" },
  { text: "> loading biotech analytics dataset...", color: "muted" },
  { text: "  [M.SC MICROBIOLOGY DATA MODULES] -> active.", color: "cyan" },
  { text: "> binding strategic operations controller...", color: "muted" },
  { text: "  [THE AMERICAN COLLEGE MBA CORE] -> aligned.", color: "purple" },
  { text: "> authentication sequence: SUCCESS.", color: "cyan" },
  { text: "  Welcome, guest! Aathithya Engine online.", color: "purple" },
  { text: "  Type commands in the console at the bottom of the page.", color: "cyan" }
];

function bootHeroTerminal() {
  if (!heroTerminal) return;
  heroTerminal.innerHTML = "";
  let lineIdx = 0;

  function renderNextLine() {
    if (lineIdx >= bootLines.length) return;
    const line = bootLines[lineIdx];
    const lineDiv = document.createElement('div');
    lineDiv.className = `terminal-row-line ${line.color}`;
    lineDiv.textContent = line.text;
    heroTerminal.appendChild(lineDiv);
    
    // Auto scroll
    heroTerminal.scrollTop = heroTerminal.scrollHeight;
    lineIdx++;
    setTimeout(renderNextLine, Math.random() * 150 + 50);
  }
  
  setTimeout(renderNextLine, 500);
}

// --- FULL CLI INTERACTIVE TERMINAL SECTION ---
const cliInput = document.getElementById('terminal-cli-input');
const cliLogs = document.getElementById('terminal-output-log');

const terminalCommands = {
  help: () => {
    return [
      "Available Core Commands:",
      "  skills      - Query complete technical skill categories.",
      "  projects    - Print architectural details of Catering & Construction platforms.",
      "  about       - Read professional profile summary.",
      "  resume      - Output academic and timeline vectors.",
      "  contact     - Reveal coordinate ports for direct signals.",
      "  github      - Output Git repository link.",
      "  ai [query]  - Speak with the built-in system copilot assistant.",
      "  clear       - Wipe console outputs.",
      "  exit        - Safe log-off."
    ];
  },
  skills: () => {
    return [
      "--- COMPLETE TECHNOLOGY STACK MATRIX ---",
      "  Languages:      Java, JavaScript, SQL",
      "  Frontend:       HTML5, CSS3, Responsive Design, Flexbox/Grid, DOM Manipulation,",
      "                  ES6, Async/Await, API Integration",
      "  Backend:        Core Java, OOP, Collections, Exception Handling, Multithreading,",
      "                  JDBC, Servlets & JSP, Spring Boot, Spring MVC, RESTful APIs,",
      "                  Spring Security, Microservices (Basics)",
      "  Databases:      MySQL, PostgreSQL, MongoDB (Basics), DB Design,",
      "                  SQL Joins & Subqueries, Stored Procedures & Triggers",
      "  DSA:            Arrays, Linked Lists, Stack & Queue, Trees & Graphs,",
      "                  Searching, Sorting, Recursion",
      "  Dev Tools:      JUnit, Git & GitHub, Postman, Jira, NetBeans, VS Code",
      "  UI/Design:      Figma, JavaFX, Scene Builder",
      "  AI Tools:       ChatGPT, Cursor AI, Replit, Blackbox AI, Prompt Engineering",
      "----------------------------------------"
    ];
  },
  projects: () => {
    return [
      "--- ENTERPRISE BACKEND ARCHITECTURES ---",
      " 1. Catering Business Management System",
      "    - Stack: Java, MySQL, JDBC",
      "    - Focus: Automated invoice calculations, JDBC DAO transactional layer.",
      " 2. Construction Business Management Application",
      "    - Stack: Java, MySQL, JDBC",
      "    - Focus: Resource allocation algorithms, relational table constraints.",
      "------------------------------------"
    ];
  },
  about: () => {
    return [
      "Prajin - System Builder",
      "  - Fuses Core Java capabilities with operations strategy (pursuing MBA).",
      "  - Analytical background backed by M.Sc Microbiology research frameworks.",
      "  - Core Focus: Designing modular backends, atomic persistence databases."
    ];
  },
  resume: () => {
    return [
      "--- SCHOLASTIC VECTORS ---",
      "  - Java Development (Present): Magizhchi Tech Academy, Madurai",
     
    ];
  },
  contact: () => {
    return [
      "--- COGNITIVE PORT CONNECTIVITY ---",
      "  Location:  Madurai, Tamil Nadu, India",
     
    ];
  },
  github: () => {
    return [
      "Node link: https://github.com/aathithyapandiyan01-ux"
    ];
  },
  clear: () => {
    if (cliLogs) cliLogs.innerHTML = "";
    return [];
  },
  exit: () => {
    return ["Logging off core guest shell. Interface sleeping..."];
  }
};

function writeCliOutput(lines) {
  if (!cliLogs) return;
  lines.forEach(l => {
    const row = document.createElement('div');
    row.className = "log-row";
    row.textContent = l;
    cliLogs.appendChild(row);
  });
  cliLogs.scrollTop = cliLogs.scrollHeight;
}

if (cliInput) {
  cliInput.addEventListener('keydown', (e) => {
    if (e.key === 'Enter') {
      const rawText = cliInput.value.trim();
      cliInput.value = "";
      if (!rawText) return;

      if (typeof window.playClickSound === 'function') window.playClickSound();

      // Log the entered command
      writeCliOutput([`guest@aathithya-digital-terminal:~$ ${rawText}`]);

      const parts = rawText.split(' ');
      const cmd = parts[0].toLowerCase();
      const args = parts.slice(1).join(' ');

      if (cmd === 'ai') {
        if (!args) {
          writeCliOutput(["[Copilot] Please provide a query. Example: 'ai explain stack'"]);
        } else {
          writeCliOutput([`[Copilot] Processing signal: "${args}"...`]);
          setTimeout(() => {
            if (typeof window.generateAIResponse === 'function') {
              const aiResponse = window.generateAIResponse(args);
              writeCliOutput([`[Copilot] Response:`, ...aiResponse.split('\n').map(l => `  ${l}`)]);
            } else {
              writeCliOutput(["[Copilot] AI Core loading... Try again."]);
            }
          }, 800);
        }
      } else if (terminalCommands[cmd]) {
        const response = terminalCommands[cmd]();
        writeCliOutput(response);
      } else {
        writeCliOutput([`Terminal command '${cmd}' not recognized. Type 'help' to review directory nodes.`]);
      }
    }
  });
}

// Dispatch mock CLI terminal simulation runs
window.runTerminalDemo = (systemId) => {
  if (typeof window.playClickSound === 'function') window.playClickSound();
  const termSection = document.getElementById('terminal');
  if (termSection) {
    termSection.scrollIntoView({ behavior: 'smooth' });
  }
  
  // Focus on terminal input
  if (cliInput) cliInput.focus();
  if (!cliLogs) return;
  
  cliLogs.innerHTML = "";
  writeCliOutput([
    `guest@aathithya-digital-terminal:~$ run-system-demo --target=${systemId}`,
    `[System] Initializing simulation for: ${systemId === 'catering-system' ? 'Catering Business Management' : 'Construction Business Management'}`,
    `[System] Spawning JVM subprocess runtime context...`,
    `[System] Acquiring MySQL connection pooling threads...`,
    `[HikariCP] Active connections: 4, idle: 16 (max: 20)`,
    `[JDBC] Connection established to catalog database.`
  ]);
  
  setTimeout(() => {
    if (systemId === 'catering-system') {
      writeCliOutput([
        `[CBMS Core] Loading invoicing modules...`,
        `[CBMS Core] Concurrency model: BigDecimal math context initialized.`,
        `[CBMS Core] Invoking SQL statement: SELECT * FROM catering_orders LIMIT 4;`,
        `---------------------------------------------------------------------------------`,
        ` order_id | customer_id | billing_total | order_status | created_at`,
        `---------------------------------------------------------------------------------`,
        ` 2001     | 10          | 2450.75       | COMMITTED    | 2026-05-18 10:14:02`,
        ` 2002     | 14          | 120.00        | COMMITTED    | 2026-05-18 11:20:45`,
        ` 2003     | 5           | 890.00        | COMMITTED    | 2026-05-19 09:30:11`,
        ` 2004     | 21          | 4310.20       | PENDING      | 2026-05-20 14:15:00`,
        `---------------------------------------------------------------------------------`,
        `[System] Simulation run completed successfully. Thread-locks: 0.`
      ]);
    } else {
      writeCliOutput([
        `[CBMA Core] Loading scheduling engine and material pipelines...`,
        `[CBMA Core] Decoupled DAO controllers online. Initializing thread pools...`,
        `[CBMA Core] Invoking SQL statement: SELECT * FROM construction_projects;`,
        `---------------------------------------------------------------------------------`,
        ` project_id | client_name          | allocated_budget | phase_state`,
        `---------------------------------------------------------------------------------`,
        ` 1          | Madurai Infra Ltd.   | 5000000.00       | PLANNING`,
        ` 2          | Sharon Apartments    | 12000000.00      | IN_PROGRESS`,
        ` 3          | City Bypass Project  | 35000000.00      | COMPLETED`,
        `---------------------------------------------------------------------------------`,
        `[System] Inventory mapping verified. Service-DAO deadlocks: 0. Commit completed.`
      ]);
    }
  }, 1200);
};

// Global Boot Trigger
window.addEventListener('DOMContentLoaded', () => {
  bootHeroTerminal();
});