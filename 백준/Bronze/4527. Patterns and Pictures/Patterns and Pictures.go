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

	var n int
	fmt.Fscan(r, &n)

	for i := 0; i < n; i++ {
		var l int
		fmt.Fscan(r, &l)

		var total int
		ratios := make([]int, l)

		for j := 0; j < l; j++ {
			var S, R int
			fmt.Fscan(r, &S, &R)
			total += S * R
			ratios[j] = R
		}

		ans := make([]int, 3)
		for k := 0; k < 3; k++ {
			fabric := (k + 1) * 36 * 36
			ans[k] = fabric / total
		}

		fmt.Fprintf(w, "%d %d %d\n", ans[0], ans[1], ans[2])
	}
}
