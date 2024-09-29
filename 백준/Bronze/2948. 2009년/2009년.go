package main

import (
	"fmt"
)

func main() {
	var d, m int
	fmt.Scan(&d, &m)

	ans := d
	switch m {
	case 12:
		ans += 30
		fallthrough
	case 11:
		ans += 31
		fallthrough
	case 10:
		ans += 30
		fallthrough
	case 9:
		ans += 31
		fallthrough
	case 8:
		ans += 31
		fallthrough
	case 7:
		ans += 30
		fallthrough
	case 6:
		ans += 31
		fallthrough
	case 5:
		ans += 30
		fallthrough
	case 4:
		ans += 31
		fallthrough
	case 3:
		ans += 28
		fallthrough
	case 2:
		ans += 31
	}

	switch ans % 7 {
	case 0:
		fmt.Println("Wednesday")
	case 1:
		fmt.Println("Thursday")
	case 2:
		fmt.Println("Friday")
	case 3:
		fmt.Println("Saturday")
	case 4:
		fmt.Println("Sunday")
	case 5:
		fmt.Println("Monday")
	case 6:
		fmt.Println("Tuesday")
	}
}
