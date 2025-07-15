const codeTitles = [
 "Gradle",
  "CommonLazyVerticalGrid",
];

function renderTitleList(filtered = codeTitles) {
  const container = document.getElementById("title-list");
  container.innerHTML = "";
  filtered.forEach(title => {
    const btn = document.createElement("button");
    btn.textContent = title;
    btn.className = "title-btn";
    btn.onclick = () => loadCodeFile(title);
    container.appendChild(btn);
  });
}

function loadCodeFile(fileName) {
  fetch(`snippets/${fileName}.kt`)
    .then(response => {
      if (!response.ok) throw new Error("File not found");
      return response.text();
    })
    .then(code => {
      document.getElementById("code-display").textContent = code;
    })
    .catch(error => {
      document.getElementById("code-display").textContent = "// Error loading file: " + error.message;
    });
}

function copyCode() {
  const code = document.getElementById("code-display").innerText;
  navigator.clipboard.writeText(code).then(() => {
    alert("Code copied to clipboard!");
  }).catch(err => {
    alert("Failed to copy: " + err);
  });
}

function filterTitles(searchText) {
  const filtered = codeTitles.filter(title =>
    title.toLowerCase().includes(searchText.toLowerCase())
  );
  renderTitleList(filtered);
}

renderTitleList();
