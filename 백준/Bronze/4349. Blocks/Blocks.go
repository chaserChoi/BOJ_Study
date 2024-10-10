package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	var c int
	fmt.Fscan(r, &c)

	for x := 0; x < c; x++ {
		var n int
		fmt.Fscan(r, &n)

		var poss [][3]int

		for i := 1; i <= n; i++ {
			for j := 1; j <= n; j++ {
				if i*j > n {
					break
				}
				k := (n / i) / j
				if i*j*k == n {
					poss = append(poss, [3]int{i, j, k})
				}
			}
		}

		min := math.MaxInt32
		for _, d := range poss {
			a, b, c := d[0], d[1], d[2]
			area := 2 * (a*b + b*c + c*a)
			if min > area {
				min = area
			}
		}

		fmt.Fprintln(w, min)
	}
}
