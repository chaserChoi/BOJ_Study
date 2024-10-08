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

	for i := 0; i < t; i++ {
		var a, b string
		fmt.Fscan(r, &a)
		fmt.Fscan(r, &b)

		hamming := 0
		for j := 0; j < len(a); j++ {
			if a[j] != b[j] {
				hamming++
			}
		}

		fmt.Fprintf(w, "Hamming distance is %d.\n", hamming)
	}
}
