function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const t = parseInt(input[0]);
  const ans = [];

  for (let i = 1; i <= t; i++) {
    const line = input[i];
    let result = "";
    let j = 0;

    while (j < line.length) {
      let k = 0;

      while (j + k < line.length && line[j + k] === line[j]) k++;

      result += `${k}${line[j]}`;
      j += k;
    }

    ans.push(result);
  }

  console.log(ans.join("\n"));
}

main();
