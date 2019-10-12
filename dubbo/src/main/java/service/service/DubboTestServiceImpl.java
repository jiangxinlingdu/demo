
package service.service;

import org.springframework.stereotype.Service;

/**
 * DubboTestServiceImpl.
 *
 */
@Service("dubboTestService")
public class DubboTestServiceImpl implements DubboTestService {

    @Override
    public String findAll() {
        return "test";
    }

}
