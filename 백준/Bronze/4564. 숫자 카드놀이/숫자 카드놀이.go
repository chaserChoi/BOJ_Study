package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	r := bufio.NewReader(os.Stdin)
	w := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	for {
		var t int
		fmt.Fscan(r, &t)

		if t == 0 {
			break
		}

		temp := 1

		for len(strconv.Itoa(t)) != 1 {
			fmt.Print(t, " ")
			temp = 1

			for _, d := range strconv.Itoa(t) {
				n := int(d - '0')
				temp *= n
			}

			t = temp
		}

		fmt.Println(t)
	}
}
