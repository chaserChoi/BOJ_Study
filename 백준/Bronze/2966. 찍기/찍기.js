function main() {
  const input = require("fs").readFileSync("/dev/stdin").toString().trim().split("\n");
  
  const n = parseInt(input[0]);
  const ans = input[1];

  const adrian = 'ABC';
  const bruno = 'BABC';
  const goran = 'CCAABB';

  let scores = {
    Adrian: 0,
    Bruno: 0,
    Goran: 0
  };

  for (let i = 0; i < n; i++) {
    if (ans[i] === adrian[i % 3]) scores.Adrian++;
    if (ans[i] === bruno[i % 4]) scores.Bruno++;
    if (ans[i] === goran[i % 6]) scores.Goran++;
  }

  const max = Math.max(scores.Adrian, scores.Bruno, scores.Goran);

  const win = [];
  if (scores.Adrian === max) win.push("Adrian");
  if (scores.Bruno === max) win.push("Bruno");
  if (scores.Goran === max) win.push("Goran");

  console.log(max);
  win.forEach(win => console.log(win));
}

main();
