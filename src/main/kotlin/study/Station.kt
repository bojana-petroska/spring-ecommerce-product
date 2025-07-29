package study

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity // (1)
@Table(name = "station") // (2)
class Station(
    @Column(name = "name", nullable = false) // (3)
    var name: String,

    @Id // (4)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // (5)
    val id: Long = 0L,
) // (6)