class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        // 이름 & 점수 매핑 
        val scoreMap = name.indices.associate { name[it] to yearning[it] }
        
        // 각 사진별 추억 점수 계산
        // map: photo 배열 각 요소(한 장의 사진) 변환
        // sumOf: 사진 속 인물들 점수 합계
        return photo.map { people -> 
            people.sumOf { person -> 
                // 해당 인물이 map 존재 -> 점수 반환
                // 없으면 -> 0
                scoreMap[person] ?: 0
            }
        }.toIntArray()
    }
}