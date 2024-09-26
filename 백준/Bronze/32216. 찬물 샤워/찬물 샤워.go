package main

import (
	"fmt"
	"math"
)

func main() {
	var n, k, t0 int
	fmt.Scan(&n, &k, &t0)

	d := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&d[i])
	}

	t := t0
	idx := 0

	for i := 0; i < n; i++ {
		if t > k {
			t = t + d[i] - int(math.Abs(float64(t-k)))
		} else if t < k {
			t = t + d[i] + int(math.Abs(float64(t-k)))
		} else {
			t = t + d[i]
		}

		idx += int(math.Abs(float64(t - k)))
	}

	fmt.Println(idx)
}
