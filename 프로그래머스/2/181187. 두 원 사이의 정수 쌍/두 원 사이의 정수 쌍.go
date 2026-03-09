import (
    "math"
)

func solution(r1 int, r2 int) int64 {
    var answer int64 = 0

	r1Sq := int64(r1) * int64(r1)
	r2Sq := int64(r2) * int64(r2)

	for x := int64(1); x <= int64(r2); x++ {
		xSq := x * x

        // 큰 원 경계
		maxY := int64(math.Floor(math.Sqrt(float64(r2Sq - xSq))))

		var minY int64 = 0

        // 작은 원의 내부에 x가 위치할 때만 계산 
		if x < int64(r1) {
			minY = int64(math.Ceil(math.Sqrt(float64(r1Sq - xSq))))
		}

        // 해당 x좌표에서 가능한 점 개수 누적 
		answer += maxY - minY + 1
	}

    // 4개의 사분면 대칭 => 4 곱함 
	return answer * 4
}