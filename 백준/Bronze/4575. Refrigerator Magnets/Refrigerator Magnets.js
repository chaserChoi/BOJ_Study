function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (let line of input) {
    if (line == "END") break;

    const seen = new Set();
    let isVal = true;

    for (let c of line) {
      if (c != " ") {
        if (seen.has(c)) {
          isVal = false;
          break;
        }
        seen.add(c);
      }
    }

    if (isVal) ans.push(line);
  }

  console.log(ans.join("\n"));
}

main();
