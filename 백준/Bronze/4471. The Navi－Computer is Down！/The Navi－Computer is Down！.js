function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim();

  const lines = input.split("\n");
  const n = parseInt(lines[0]); 
  let ans = [];

  let idx = 1;
  for (let i = 0; i < n; i++) {
    const curr = lines[idx++].trim();
    const [x1, y1, z1] = lines[idx++].trim().split(" ").map(Number);

    const dest = lines[idx++].trim();
    const [x2, y2, z2] = lines[idx++].trim().split(" ").map(Number);

    const dist = Math.sqrt(
      Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2)
    );

    ans.push(
      `${curr} to ${dest}: ${dist.toFixed(2)}`
    );
  }

  console.log(ans.join("\n"));
}

main();
