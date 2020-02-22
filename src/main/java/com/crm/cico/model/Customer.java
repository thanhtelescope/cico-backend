package com.crm.cico.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

}

//            Ashton Cox,San Francisco,2009-01-12
//            Bradley Greer,London,2012-10-13
//            Brenden Wagner,San Francisco,2011-06-07
//            Brielle Williamson,New York,2012-12-02
//            Bruno Nash,London,2011-05-03
//            Caesar Vance,New York,2011-12-12
//            Cara Stevens,New York,2011-12-06
//            Cedric Kelly,Edinburgh,2012-03-29
//            Charde Marshall,San Francisco,2008-10-16
//            Colleen Hurst,San Francisco,2009-09-15
//            Dai Rios,Edinburgh,2012-09-26
//            Donna Snider,New York,2011-01-25
//            Doris Wilder,Sidney,2010-09-20
//            Finn Camacho,San Francisco,2009-07-07
//            Fiona Green,San Francisco,2010-03-11
//            Garrett Winters,Tokyo,2011-07-25
//            Gavin Cortez,San Francisco,2008-10-26
//            Gavin Joyce,Edinburgh,2010-12-22
//            Gloria Little,New York,2009-04-10
//            Haley Kennedy,London,2012-12-18
//            Hermione Butler,London,2011-03-21
//            Herrod Chandler,San Francisco,2012-08-06
//            Hope Fuentes,San Francisco,2010-02-12
//            Howard Hatfield,San Francisco,2008-12-16
//            Jackson Bradshaw,New York,2008-09-26
//            Jena Gaines,London,2008-12-19
//            Jenette Caldwell,New York,2011-09-03
//            Jennifer Acosta,Edinburgh,2013-02-01
//            Jennifer Chang,Singapore,2010-11-14
//            Jonas Alexander,San Francisco,2010-07-14
//            Lael Greer,London,2009-02-27
//            Martena Mccray,Edinburgh,2011-03-09
//            Michael Bruce,Singapore,2011-06-27
//            Michael Silva,London,2012-11-27
//            Michelle House,Sidney,2011-06-02
//            Olivia Liang,Singapore,2011-02-03
//            Paul Byrd,New York,2010-06-09
//            Prescott Bartlett,London,2011-05-07
//            Quinn Flynn,Edinburgh,2013-03-03
//            Rhona Davidson,Tokyo,2010-10-14
//            Sakura Yamamoto,Tokyo,2009-08-19
//            Serge Baldwin,Singapore,2012-04-09
//            Shad Decker,Edinburgh,2008-11-13
//            Shou Itou,Tokyo,2011-08-14
//            Sonya Frost,Edinburgh,2008-12-13
//            Suki Burks,London,2009-10-22
//            Tatyana Fitzpatrick,London,2010-03-17
//            Thor Walton,New York,2013-08-11
//            Tiger Nixon,Edinburgh,2011-04-25
//            Timothy Mooney,London,2008-12-11
//            Unity Butler,San Francisco,2009-12-09
//            Vivian Harrell,San Francisco,2009-02-14
//            Yuri Berry,New York,2009-06-25
//            Zenaida Frank,New York,2010-01-04
//            Zorita Serrano,San Francisco,2012-06-01