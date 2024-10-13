function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split('\n')
    .map(Number);

  let t = 0;

  for (const n of input) {
    if (n === 0) break;

    t++;
    console.log(`Case ${t}:`);
    console.log(`${n} pencils for ${n} cents`);

    const ans = [];

    for (let x = 1; x < n - 1; x++) {
      const y = 3 * n - 15 * x; 
      const z = n - x - y; 

      if (y > 0 && z > 0) 
        ans.push([x, y, z]);
    }

    if (ans.length === 0) 
      console.log("No solution found.\n");
    else {
      for (const [x, y, z] of ans) {
        console.log(`${x} at four cents each`);
        console.log(`${y} at two for a penny`);
        console.log(`${z} at four for a penny\n`);
      }
    }
  }
}

main();
