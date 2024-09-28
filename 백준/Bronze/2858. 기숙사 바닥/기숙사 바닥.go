package main

import (
	"fmt"
)

func main() {
	var r, b int
	fmt.Scan(&r, &b)

	for l := 3; ; l++ {
		w := (r + 4 - 2*l) / 2
		if w < 3 {
			continue
		}

		if (l-2)*(w-2) == b {
			if l >= w {
				fmt.Printf("%d %d\n", l, w)
			} else {
				fmt.Printf("%d %d\n", w, l)
			}
			break
		}
	}
}
