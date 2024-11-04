function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const t = parseInt(input[0]);
  let ans = [];

  let idx = 1;
  for (let i = 0; i < t; i++) {
    const n = parseInt(input[idx++]);
    const store = input[idx++].split(" ").map(Number);

    store.sort((a, b) => a - b);

    const dist = (store[store.length - 1] - store[0]) * 2;
    ans.push(dist);
  }

  console.log(ans.join("\n"));
}

main();
