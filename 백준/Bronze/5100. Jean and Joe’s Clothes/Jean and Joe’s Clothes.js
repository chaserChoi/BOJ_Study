function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let ans = [];
  let idx = 0;

  while (true) {
    const n = parseInt(input[idx++]);

    if (n === 0) break;

    let joe = 0;
    let jean = 0;
    let jane = 0;
    let james = 0;
    let unread = 0;

    for (let i = 0; i < n; i++) {
      const size = input[idx++].trim();

      if (size === "M" || size === "L") joe++;
      else if (size === "S") james++;
      else if (!isNaN(size)) {
        const numericSize = parseInt(size);
        if (numericSize >= 12) jean++;
        else jane++;
      } else if (size === "X") unread++;
    }
    ans.push(`${joe} ${jean} ${jane} ${james} ${unread}`);
  }
  console.log(ans.join("\n"));
}

main();
