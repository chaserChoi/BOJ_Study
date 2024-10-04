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

	min := int(^uint(0) >> 1)
	num := [3]int{}

	for i := 1; i <= n; i++ {
		for j := 1; j <= i; j++ {
			if i*j > n {
				break
			}
			for k := 1; k <= j; k++ {
				if i*j*k > n {
					break
				}
				if i*j*k == n {
					surface := 2 * (i*j + j*k + k*i)
					if surface < min {
						min = surface
						num[0], num[1], num[2] = i, j, k
					}
				}
			}
		}
	}

	fmt.Fprintf(w, "%d %d %d\n", num[0], num[1], num[2])
}
