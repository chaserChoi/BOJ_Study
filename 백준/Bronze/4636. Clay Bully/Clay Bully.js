function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let idx = 0;
  const ans = [];

  while (true) {
    const n = parseInt(input[idx++]);
    if (n === -1) break;

    const students = [];
    let total = 0;

    for (let i = 0; i < n; i++) {
      const line = input[idx++];
      const [x, y, z, name] = line.split(" ");
      const vol = parseInt(x) * parseInt(y) * parseInt(z);
      students.push({ name, vol });
      total += vol;
    }

    const avg = total / n;
    let vic = null;
    let bully = null;

    for (const s of students) {
      if (s.vol < avg) vic = s.name;
      else if (s.vol > avg) bully = s.name;
    }

    ans.push(`${bully} took clay from ${vic}.`);
  }

  console.log(ans.join("\n"));
}

main();
