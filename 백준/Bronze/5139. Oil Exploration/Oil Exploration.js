function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const k = parseInt(input[0]);
  const ans = [];
  let idx = 1;

  for (let i = 1; i <= k; i++) {
    const [h, w] = input[idx++].split(" ").map(Number);
    const map = input.slice(idx, idx + h);
    idx += h;

    const costs = [];

    for (let col = 0; col < w; col++) {
      let c = 0;
      let foundOil = false;

      for (let row = 0; row < h; row++) {
        const material = map[row][col];

        if (material === "X") {
          foundOil = true;
          costs.push(c);
          break;
        } else if (material === "H") c += 3;
        else if (material === "S") c += 1;
      }

      if (!foundOil) costs.push("N");
    }

    ans.push(`Data Set ${i}:`);
    ans.push(costs.join(" "));
    ans.push("");
  }

  console.log(ans.join("\n"));
}

main();
