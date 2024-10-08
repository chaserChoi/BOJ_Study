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

	events := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Fscan(r, &events[i])
	}

	logged := make(map[int]bool)
	suspicious := 0

	for _, e := range events {
		if e > 0 {
			logged[e] = true
		} else {
			user := -e
			if !logged[user] {
				suspicious++
			} else {
				delete(logged, user)
			}
		}
	}

	fmt.Fprintln(w, suspicious)
}
