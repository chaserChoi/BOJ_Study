function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  let idx = 0;
  const ans = [];

  while (true) {
    const first = input[idx++];
    if (first === "0") break;

    const [k, m] = first.split(" ").map(Number);
    const selected = new Set(
      input
        .slice(idx, idx + 1)
        .join(" ")
        .split(" ")
        .map(Number)
    );
    idx++;

    let isGraduated = true;

    for (let i = 0; i < m; i++) {
      const cate = input[idx++].split(" ").map(Number);
      const c = cate[0];
      const r = cate[1];
      const courses = new Set(cate.slice(2));

      const selectedCnt = [...selected].filter((course) =>
        courses.has(course)
      ).length;

      if (selectedCnt < r) isGraduated = false;
    }

    ans.push(isGraduated ? "yes" : "no");
  }

  console.log(ans.join("\n"));
}

main();
