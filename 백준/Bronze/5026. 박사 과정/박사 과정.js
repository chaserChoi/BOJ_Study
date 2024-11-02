function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const n = parseInt(input[0]);
  const res = [];

  for (let i = 1; i <= n; i++) {
    const s = input[i];

    if (s === "P=NP") {
      res.push("skipped");
    } else {
      const plusIdx = s.indexOf("+");
      const a = s.substring(0, plusIdx);
      const b = s.substring(plusIdx + 1);
      const ans = parseInt(a) + parseInt(b);
      res.push(ans);
    }
  }

  console.log(res.join("\n"));
}

main();
