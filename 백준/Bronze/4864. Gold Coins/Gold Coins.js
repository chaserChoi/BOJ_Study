function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (const line of input) {
    const days = parseInt(line);
    if (days === 0) break;

    let total = 0;
    let curr = 1;
    let n = 1;
    let cnt = 1;

    while (curr <= days) {
      for (let i = 0; i < cnt && curr <= days; i++, curr++) total += n;
      n++;
      cnt++;
    }

    ans.push(`${days} ${total}`);
  }

  console.log(ans.join("\n"));
}

main();
