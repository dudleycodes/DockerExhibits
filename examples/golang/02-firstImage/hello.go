package main

import (
	"fmt"
	"time"
)

func main() {
	delay := time.Duration(200 * time.Millisecond)

	fmt.Println("")
	fmt.Println("           +-----------------------------------------+")
	time.Sleep(delay)
	fmt.Println("          /                                         /|")
	time.Sleep(delay)
	fmt.Println("         /                                         / |")
	time.Sleep(delay)
	fmt.Println("        *-----------------------------------------*  |")
	time.Sleep(delay)
	fmt.Println("        |                                         |  |")
	time.Sleep(delay)
	fmt.Println("        |    And when Ruby went over the hill,    |  |")
	time.Sleep(delay)
	fmt.Println("        |    Go came in for the kill.             |  |")
	time.Sleep(delay)
	fmt.Println("        |    It seemed so fast,                   |  |")
	time.Sleep(delay)
	fmt.Println("        |    But oh at long last,                 |  |")
	time.Sleep(delay)
	fmt.Println("        |    We all got tired of err != nil.      | /")
	time.Sleep(delay)
	fmt.Println("        |                                         |/")
	time.Sleep(delay)
	fmt.Println("        *-----------------------------------------*")
	fmt.Println("")
}
