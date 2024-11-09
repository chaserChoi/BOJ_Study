function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const k = parseInt(input[0]);
  let ans = [];

  let idx = 1;
  for (let i = 1; i <= k; i++) {
    const [n, w] = input[idx++].split(" ").map(Number);
    const samples = input[idx++].split(" ").map(Number);

    const movingAvg = [];

    for (let j = 0; j <= n - w; j++) {
      const window = samples.slice(j, j + w).reduce((acc, num) => acc + num, 0);
      const avg = Math.floor(window / w);
      movingAvg.push(avg);
    }

    const max = Math.max(...movingAvg);
    const min = Math.min(...movingAvg);
    const diff = Math.abs(max - min);

    ans.push(`Data Set ${i}:`);
    ans.push(diff.toString());
    ans.push("");
  }

  console.log(ans.join("\n"));
}

main();
