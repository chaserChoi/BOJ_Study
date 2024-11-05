function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (const line of input) {
    if (line === "#") break;

    const cards = line.split(" ").slice(0, -1);
    let cheryl = 0;
    let tania = 0;

    for (const c of cards) {
      let val;

      if (c === "A") val = 1;
      else val = parseInt(c);

      if (val % 2 === 0) tania++;
      else cheryl++;
    }

    if (cheryl > tania) ans.push("Cheryl");
    else if (cheryl < tania) ans.push("Tania");
    else ans.push("Draw");
  }

  console.log(ans.join("\n"));
}

main();
