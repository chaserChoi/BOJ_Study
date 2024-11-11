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
    const [n, m] = input[idx++].split(" ").map(Number);
    const stations = [];

    for (let j = 0; j < n; j++) {
      const [x, y] = input[idx++].split(" ").map(Number);
      stations.push({ x, y });
    }

    const visited = input[idx++]
      .split(" ")
      .map(Number)
      .map((j) => j - 1);

    let minX = Infinity,
      maxX = -Infinity,
      minY = Infinity,
      maxY = -Infinity;

    for (const idx of visited) {
      const { x, y } = stations[idx];
      minX = Math.min(minX, x);
      maxX = Math.max(maxX, x);
      minY = Math.min(minY, y);
      maxY = Math.max(maxY, y);
    }

    let visibleCnt = 0;

    for (const { x, y } of stations) {
      if (x >= minX && x <= maxX && y >= minY && y <= maxY) visibleCnt++;
    }

    ans.push(`Data Set ${i}:`);
    ans.push(visibleCnt.toString());
    ans.push("");
  }

  console.log(ans.join("\n"));
}

main();
