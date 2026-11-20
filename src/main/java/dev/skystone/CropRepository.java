/*
* File: CropRepository.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/CWGSkyStone213/
* Licenc: MIT
*/

package dev.skystone;

import java.util.List;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class CropRepository implements Repository<Crop>{

    private final String host_api;

    public CropRepository(){
        Config config = new Config();
        host_api = config.getProperty("host_api");
    }

    @Override
    public List<Crop> findAll() {
        ResClient res_client = new ResClient();
        String json = res_client.get(host_api + "/crops");
        
        CropResponse res = ResConvert.toObject(json, CropResponse.class);

        List<Crop> crop_list = res.data;

        return crop_list;
    }
    
}
