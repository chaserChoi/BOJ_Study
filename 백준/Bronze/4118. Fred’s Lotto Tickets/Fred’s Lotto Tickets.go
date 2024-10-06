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

	for {
		var n int
		fmt.Fscan(r, &n)
		if n == 0 {
			break
		}

		covered := make([]bool, 50)

		for i := 0; i < n; i++ {
			var a, b, c, d, e, f int
			fmt.Fscan(r, &a, &b, &c, &d, &e, &f)

			covered[a] = true
			covered[b] = true
			covered[c] = true
			covered[d] = true
			covered[e] = true
			covered[f] = true
		}

		allCovered := true
		for i := 1; i <= 49; i++ {
			if !covered[i] {
				allCovered = false
				break
			}
		}

		if allCovered {
			fmt.Fprintln(w, "Yes")
		} else {
			fmt.Fprintln(w, "No")
		}
	}
}
