function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (let line of input) {
    if (line === "#") break;

    let yes = 0;
    let no = 0;
    let present = 0;
    let absent = 0;

    for (let vote of line) {
      if (vote === "Y") yes++;
      else if (vote === "N") no++;
      else if (vote === "P") present++;
      else if (vote === "A") absent++;
    }

    const total = yes + no + present + absent;

    if (absent >= total / 2) ans.push("need quorum");
    else {
      if (yes > no) ans.push("yes");
      else if (yes < no) ans.push("no");
      else ans.push("tie");
    }
  }

  console.log(ans.join("\n"));
}

main();
