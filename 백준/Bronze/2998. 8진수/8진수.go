package main

import (
	"fmt"
	"strconv"
)

func main() {
	var bin string
	fmt.Scan(&bin)

	for len(bin)%3 != 0 {
		bin = "0" + bin
	}

	oct := ""

	for i := 0; i < len(bin); i += 3 {
		group := bin[i : i+3]
		octDigit, _ := strconv.ParseInt(group, 2, 0)
		oct += strconv.Itoa(int(octDigit))
	}

	fmt.Println(oct)
}
