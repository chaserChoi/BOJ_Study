function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let idx = 0;
  const ans = [];

  while (idx < input.length) {
    const [n, m] = input[idx++].split(" ").map(Number);
    if (n === 0 && m === 0) break;

    const taroCards = [];
    const hanakoCards = [];

    for (let i = 0; i < n; i++) taroCards.push(Number(input[idx++]));
    for (let i = 0; i < m; i++) hanakoCards.push(Number(input[idx++]));

    const taroSum = taroCards.reduce((a, b) => a + b, 0);
    const hanakoSum = hanakoCards.reduce((a, b) => a + b, 0);

    const diff = (taroSum - hanakoSum) / 2;

    let found = false;
    let bestPair = null;

    const taroSet = new Set(taroCards);
    for (const y of hanakoCards) {
      const x = y + diff;
      if (taroSet.has(x)) {
        if (!found || (bestPair && x + y < bestPair[0] + bestPair[1])) {
          bestPair = [x, y];
          found = true;
        }
      }
    }

    if (found) ans.push(`${bestPair[0]} ${bestPair[1]}`);
    else ans.push("-1");
  }

  console.log(ans.join("\n"));
}

main();
