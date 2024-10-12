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

	var t int
	fmt.Fscan(r, &t)

	side1 := make([]int, 1000)
	side2 := make([]int, 1000)

	for i := 1; i < 1000; i++ {
		side1[i] = side1[i-1] + i
		side2[i] = side2[i-1] + side1[i]
	}

	for i := 0; i < t; i++ {
		var n int
		fmt.Fscan(r, &n)
		fmt.Fprintf(w, "%d: %d %d\n", i+1, n, side2[n])
	}
}
