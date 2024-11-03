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

	var e, f, c int
	fmt.Fscan(r, &e, &f, &c)

	total := 0
	empty := e + f

	for empty >= c {
		total += empty / c
		empty = empty/c + empty%c
	}

	fmt.Fprintln(w, total)
}
