function calcSupervisors() {
  const fs = require("fs");
  const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

  const n = parseInt(input[0]); 
  const a = input[1].split(" ").map(Number);
  const [b, c] = input[2].split(" ").map(Number);

  let total = 0;

  for (let i = 0; i < n; i++) {
    total++;

    const remain = a[i] - b;

    if (remain > 0) {
      const subSupervisors = Math.ceil(remain / c);
      total += subSupervisors;
    }
  }

  console.log(total); 
}

calcSupervisors();
