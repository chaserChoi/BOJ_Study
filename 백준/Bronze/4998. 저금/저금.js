function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (const line of input) {
    const [n, b, m] = line.split(" ").map(Number);
    let curr = n;
    let years = 0;

    while (curr <= m) {
      curr += curr * (b / 100);
      years++;
    }

    ans.push(years);
  }

  console.log(ans.join("\n"));
}

main();
