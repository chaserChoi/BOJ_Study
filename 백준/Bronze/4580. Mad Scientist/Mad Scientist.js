function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (let line of input) {
    const val = line.split(" ").map(Number);
    const k = val[0];

    if (k == 0) break;

    const p = val.slice(1);
    const measurements = [];

    let lastMeasure = 0;

    for (let j = 0; j < k; j++) {
      const currCnt = p[j];

      for (let cnt = currCnt - lastMeasure; cnt > 0; cnt--)
        measurements.push(j + 1);

      lastMeasure = currCnt;
    }

    ans.push(measurements.join(" "));
  }

  console.log(ans.join("\n"));
}

main();
