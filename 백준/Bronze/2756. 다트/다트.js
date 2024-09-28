function calcScore(x, y) {
  const distance = Math.sqrt(x * x + y * y);

  if (distance <= 3) return 100; 
  if (distance <= 6) return 80;
  if (distance <= 9) return 60;
  if (distance <= 12) return 40;
  if (distance <= 15) return 20;

  return 0;
}

function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const t = parseInt(input[0]); 

  for (let i = 1; i <= t; i++) {
    const darts = input[i].split(" ").map(Number);
    let p1 = 0;
    let p2 = 0;

    for (let j = 0; j < 3; j++) {
      p1 += calcScore(darts[j * 2], darts[j * 2 + 1]);
    }

    for (let j = 3; j < 6; j++) {
      p2 += calcScore(darts[j * 2], darts[j * 2 + 1]);
    }

    if (p1 > p2) {
      console.log(`SCORE: ${p1} to ${p2}, PLAYER 1 WINS.`);
    } else if (p2 > p1) {
      console.log(`SCORE: ${p1} to ${p2}, PLAYER 2 WINS.`);
    } else {
      console.log(`SCORE: ${p1} to ${p2}, TIE.`);
    }
  }
}

main();
