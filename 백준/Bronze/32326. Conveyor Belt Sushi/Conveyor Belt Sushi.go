package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	var R, G, B int
	fmt.Fscan(r, &R)
	fmt.Fscan(r, &G)
	fmt.Fscan(r, &B)

	const redPrice = 3
	const greenPrice = 4
	const bluePrice = 5

	total := R*redPrice + G*greenPrice + B*bluePrice

	fmt.Fprintln(w, total)
}
