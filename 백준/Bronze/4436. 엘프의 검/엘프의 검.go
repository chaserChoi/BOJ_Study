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
		_, err := fmt.Fscan(r, &n)
		if err != nil {
			break
		}

		digits := make([]bool, 10)
		cnt := 0
		k := 0

		for cnt < 10 {
			k++
			mul := n * k

			for mul > 0 {
				d := mul % 10
				if !digits[d] {
					digits[d] = true
					cnt++
				}
				mul /= 10
			}
		}

		fmt.Fprintln(w, k)
	}
}
