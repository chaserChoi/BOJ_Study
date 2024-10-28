function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (const line of input) {
    let [w, h] = line.split(" ").map(Number);
    if (w === 0 && h === 0) break;

    if (w < h) [w, h] = [h, w];
    if (w === h) {
      ans.push(1);
      continue;
    }

    if (w % h === 0) ans.push(w / h);
    else ans.push(w * h);
  }

  console.log(ans.join("\n"));
}

main();
