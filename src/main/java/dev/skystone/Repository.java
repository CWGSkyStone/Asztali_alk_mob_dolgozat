/*
* File: Repository.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/CWGSkyStone213/
* Licenc: MIT
*/

package dev.skystone;

import java.util.List;

public interface Repository<T> {
    public List<T> findAll();
}
