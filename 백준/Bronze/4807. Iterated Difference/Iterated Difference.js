function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let t = 1;
  let idx = 0;

  while (idx < input.length) {
    const n = parseInt(input[idx++]);
    if (n === 0) break;

    const a = input[idx++].split(" ").map(Number);
    let iter = 0;

    while (iter < 1000) {
      const allEqual = a.every((val) => val === a[0]);
      if (allEqual) {
        console.log(`Case ${t}: ${iter} iterations`);
        break;
      }

      const newA = [];
      for (let i = 0; i < n; i++) {
        const nextIdx = (i + 1) % n;
        const diff = Math.abs(a[i] - a[nextIdx]);
        newA.push(diff);
      }

      a.splice(0, n, ...newA);
      iter++;
    }

    if (iter === 1000) console.log(`Case ${t}: not attained`);

    t++;
  }
}

main();
