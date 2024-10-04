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

	var A, a, B, b, P int
	fmt.Fscan(r, &A, &a, &B, &b, &P)

	if A > P || B > P {
		fmt.Fprintln(w, "No")
	} else if A+B <= P {
		fmt.Fprintln(w, "Yes")
	} else if a >= B {
		fmt.Fprintln(w, "Yes")
	} else if b >= A {
		fmt.Fprintln(w, "Yes")
	} else {
		fmt.Fprintln(w, "No")
	}
}
