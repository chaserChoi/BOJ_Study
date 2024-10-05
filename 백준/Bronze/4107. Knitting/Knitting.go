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
		var n, m, k int
		fmt.Fscan(r, &n, &m, &k)
		if n == 0 && m == 0 && k == 0 {
			break
		}

		pattern := make([]int, k)
		for i := 0; i < k; i++ {
			fmt.Fscan(r, &pattern[i])
		}

		total := 0
		curr := n

		for i := 0; i < m; i++ {
			total += curr
			if i < k {
				curr += pattern[i]
			} else {
				curr += pattern[i%k]
			}
		}

		fmt.Fprintln(w, total)
	}
}
