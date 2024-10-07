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
		x0, _ := r.ReadString('\n')
		x0 = x0[:len(x0)-1]
		if x0 == "END" {
			break
		}

		if len(x0) == 1 {
			if x0 == "1" {
				fmt.Fprintln(w, "1")
			} else {
				fmt.Fprintln(w, "2")
			}
			continue
		}

		ans := 2
		now := len(x0)
		next := len(fmt.Sprint(now))

		for now != next {
			now = next
			next = len(fmt.Sprint(now))
			ans++
		}

		fmt.Fprintln(w, ans)
	}
}
