function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let ans = [];
  let idx = 0;

  while (true) {
    const stock = input[idx++];
    if (stock === "#") break;

    const [m, s] = input[idx++].split(" ").map(Number);
    const t = parseInt(input[idx++]);

    let curr = s;

    for (let i = 0; i < t; i++) {
      const trans = input[idx++].split(" ");
      const action = trans[0];
      const quantity = parseInt(trans[1]);

      if (action === "S") curr -= Math.min(quantity, curr);
      else if (action === "R") {
        curr += quantity;
        if (curr > m) curr = m;
      }
    }

    ans.push(`${stock} ${curr}`);
  }

  console.log(ans.join("\n"));
}

main();
