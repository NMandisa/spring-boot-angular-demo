/*
 * Copyright (c) 2024.  Noxolo Mandisa Mkhungo
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.Warehouse;
import za.co.mkhungo.facade.WarehouseFacade;
import za.co.mkhungo.repository.WarehouseRepository;
import za.co.mkhungo.response.WarehouseResponse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultWarehouseFacade implements WarehouseFacade {
  private final WarehouseRepository warehouseRepository;
  @Autowired
  public DefaultWarehouseFacade(WarehouseRepository warehouseRepository){
    super();
    this.warehouseRepository=warehouseRepository;
  }

  /**
   * @return
   */
  @Override
  public Collection<WarehouseResponse> warehouses() {
    return null;
  }

  /**
   * @param warehouse
   * @return
   */
  @Override
  public Long save(Warehouse warehouse) {
    return null;
  }

  /**
   * @param id
   * @return
   */
  @Override
  public WarehouseResponse getWarehouse(Long id) {
    return null;
  }
}
