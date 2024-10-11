function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim();

  const lines = input.split("\n");

  const n = parseInt(lines[0]); 

  for (let i = 1; i <= n; i++) {
    const s = lines[i].trim(); 
    const c = s.toLowerCase(); 

    const gCnt = (c.match(/g/g) || []).length;
    const bCnt = (c.match(/b/g) || []).length; 

    if (gCnt > bCnt) 
      console.log(`${s} is GOOD`);
    else if (gCnt < bCnt) 
      console.log(`${s} is A BADDY`);
    else 
      console.log(`${s} is NEUTRAL`);
  }
}

main();
